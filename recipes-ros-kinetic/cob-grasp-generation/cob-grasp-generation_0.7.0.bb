# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Grasp generation for Care-O-bot based on OpenRAVE"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native geometry-msgs message-generation message-runtime moveit-msgs python-scipy roslib rospy tf trajectory-msgs"
SRC_URI = "https://github.com/ipa320/cob_manipulation-release/archive/release/kinetic/cob_grasp_generation/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7d61ba525908546a72f32c3ffdc1dd13"
SRC_URI[sha256sum] = "85b9d130d0fa1d6c334db70058ea0c7c7e9076ac6f3a739f6abcf1353ae588bf"
S = "${WORKDIR}/cob_manipulation-release-release-kinetic-cob_grasp_generation-0.7.0-0"

inherit catkin
