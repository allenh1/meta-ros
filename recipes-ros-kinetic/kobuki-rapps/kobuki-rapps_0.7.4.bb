# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Robot apps for Kobuki"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-auto-docking kobuki-random-walker nodelet"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_rapps/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b7f3033a2aa55b185519e4fcfdda6caa"
SRC_URI[sha256sum] = "a1b24e6a589cdcd734cecb488547155aa57211413bd7cb714f45b964aa62f7fd"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_rapps-0.7.4-0"

inherit catkin
