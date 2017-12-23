# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MoveIt config files for all cob and raw"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native xacro"
SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/kinetic/cob_moveit_config/0.6.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3cfc580f281d4725a68781b15558d9a2"
SRC_URI[sha256sum] = "f1338cc55ab18fb65f2babdef59dbad73a94b2a0fd7bcc6f95090c341d46786a"
S = "${WORKDIR}/cob_robots-release-release-kinetic-cob_moveit_config-0.6.7-1"

inherit catkin
