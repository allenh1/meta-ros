# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "pr2eus"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native control-msgs dynamic-reconfigure euscollada move-base-msgs nav-msgs pr2-description pr2-msgs roseus rosgraph-msgs rostest sound-play"
SRC_URI = "https://github.com/tork-a/jsk_${PN}-release/archive/release/kinetic/${PN}/0.3.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d98d7393c5d45435a241687dd29dc3d"
SRC_URI[sha256sum] = "7f18b19f3d7a124928d1b53409d519929910464b0744cb617bd9b6e6f3689166"
S = "${WORKDIR}/jsk_${PN}-release-release-kinetic-${PN}-0.3.10-0"

inherit catkin
