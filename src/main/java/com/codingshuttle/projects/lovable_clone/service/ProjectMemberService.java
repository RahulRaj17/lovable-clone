package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.codingshuttle.projects.lovable_clone.dto.member.MemberResponse;
import com.codingshuttle.projects.lovable_clone.dto.member.UpdateRoleRequest;
import com.codingshuttle.projects.lovable_clone.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.lang.reflect.Member;
import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest inviteMemberRequest, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateRoleRequest request, Long userId);

    void removeProjectMember(Long projectId, Long memberId, Long userId);
}
