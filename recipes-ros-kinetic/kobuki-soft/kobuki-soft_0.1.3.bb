# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Soft kobuki impementation meta package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-softapps kobuki-softnode"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_soft-release/archive/release/kinetic/kobuki_soft/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9fec7fc6f83a1e115f432159e33796e1"
SRC_URI[sha256sum] = "f2c8ca2da587185a4f6238fd5f2e8d09910eade0ea0dc0dff91f59d01d62f9a7"
S = "${WORKDIR}/kobuki_soft-release-release-kinetic-kobuki_soft-0.1.3-0"

inherit catkin
