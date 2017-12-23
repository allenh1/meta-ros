# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Resources used for MoveIt! testing"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher robot-state-publisher"
SRC_URI = "https://github.com/ros-gbp/moveit_resources-release/archive/release/kinetic/moveit_resources/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "047827504833e54ba412f8e3c3bbcbf9"
SRC_URI[sha256sum] = "63ae9cc989f9ce3c6424831b7d056fcd7f3f96245b1834f7e3f6d5ba05550989"
S = "${WORKDIR}/moveit_resources-release-release-kinetic-moveit_resources-0.6.2-0"

inherit catkin
