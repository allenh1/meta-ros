# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An action interface to MoveIt!'s pick-and-place for Care-O-bot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native cob-grasp-generation cob-moveit-interface geometric-shapes geometry-msgs message-generation message-runtime moveit-msgs moveit-ros-move-group moveit-ros-planning-interface roscpp rospy std-msgs tf"
SRC_URI = "https://github.com/ipa320/cob_manipulation-release/archive/release/kinetic/cob_pick_place_action/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "af171475847c8bdf01f0402fb7c29a69"
SRC_URI[sha256sum] = "3db8242f23da760f35a141f60486442a64224dea869eaf394a4c2b35f3ca8da0"
S = "${WORKDIR}/cob_manipulation-release-release-kinetic-cob_pick_place_action-0.7.0-0"

inherit catkin
