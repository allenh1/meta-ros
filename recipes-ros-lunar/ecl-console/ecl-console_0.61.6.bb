# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Color codes for ansii consoles."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin ecl-build ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/lunar/ecl_console/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ed174670c7fdcef8bb13c40b47017e3"
SRC_URI[sha256sum] = "72ba9810c43171b438f808890b4cd03f918cfb3909ee37306503f276aebcdcff"
S = "${WORKDIR}/ecl_lite-release-release-lunar-ecl_console-0.61.6-0"

inherit catkin
