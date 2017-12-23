# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A MoveIt! Kinematics plugin using TRAC-IK"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core pluginlib roscpp tf-conversions trac-ik-lib"
SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/kinetic/trac_ik_kinematics_plugin/1.4.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "80d41e180ee53c8f629c22e8e8b1d400"
SRC_URI[sha256sum] = "074024d135bb1398e60e773c2a5e071d34bcf0f56544668dac2f3ed2a3c9bd3a"
S = "${WORKDIR}/trac_ik-release-release-kinetic-trac_ik_kinematics_plugin-1.4.7-0"

inherit catkin
