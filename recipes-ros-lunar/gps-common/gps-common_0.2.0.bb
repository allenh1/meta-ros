# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "GPS messages and common routines for use in GPS drivers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin message-filters message-generation message-runtime nav-msgs roscpp rospy sensor-msgs std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/lunar/gps_common/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "101753a77b8ce0394dc5714518bff024"
SRC_URI[sha256sum] = "cff01df69cf454797fe357342d38b04cbf534d4add4b1c833353324c288743d4"
S = "${WORKDIR}/gps_umd-release-release-lunar-gps_common-0.2.0-0"

inherit catkin
