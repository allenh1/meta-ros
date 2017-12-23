# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The formatters here simply format various input types to a specified    text for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-converters ecl-exceptions ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_formatters/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7cf528cd56af1e085448f975a199723a"
SRC_URI[sha256sum] = "29d6da0496fbd6809697380b716d60bf117316da43e883dd74f7b54ce8be926b"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_formatters-0.61.17-0"

inherit catkin
