# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interprocess mechanisms vary greatly across platforms - sysv, posix, win32, ther"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-time ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_ipc/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d888f038c6238f39d607ffd4d205495"
SRC_URI[sha256sum] = "9418c272205c7d415dfe000ee6763e0d14e5afbcfc835a2ddab7c0af9bbe551c"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_ipc-0.61.17-0"

inherit catkin
