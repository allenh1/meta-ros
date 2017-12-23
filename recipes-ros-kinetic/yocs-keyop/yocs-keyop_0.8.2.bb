# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Keyboard teleoperation for your robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-exceptions ecl-threads ecl-time geometry-msgs roscpp std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_keyop/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e428e59d94bcac08771e6d4a47593c4"
SRC_URI[sha256sum] = "c999362e06481f97db0fe822a662f1248b139a535bb97ed5c0491cbbc262cbad"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_keyop-0.8.2-0"

inherit catkin
