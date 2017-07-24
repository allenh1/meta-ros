# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Resources used for MoveIt! testing"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin joint-state-publisher robot-state-publisher"
SRC_URI = "https://github.com/ros-gbp/moveit_resources-release/archive/release/lunar/moveit_resources/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a7623cdc42fe09912577f2ffa1df1be2"
SRC_URI[sha256sum] = "6504a782c1c9964ba675d27e125071514467a80cc5033b30ac3c77446a6c4259"
S = "${WORKDIR}/moveit_resources-release-release-lunar-moveit_resources-0.6.2-0"

inherit catkin
