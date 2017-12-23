# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The hrpsys_tools package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hrpsys openrtm-tools rostest"
SRC_URI = "https://github.com/tork-a/rtmros_common-release/archive/release/kinetic/hrpsys_tools/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a53d9c4a3a90f73d5683ccfa02754590"
SRC_URI[sha256sum] = "b2732c77bfafcf29c26e9a2611de2c7af9ae1b845b9877be9645a1d6055d1327"
S = "${WORKDIR}/rtmros_common-release-release-kinetic-hrpsys_tools-1.4.2-0"

inherit catkin
