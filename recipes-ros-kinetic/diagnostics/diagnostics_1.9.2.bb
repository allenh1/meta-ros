# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-aggregator diagnostic-analysis diagnostic-common-diagnostics diagnostic-updater self-test"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3fd70d795f31e6027873eae550fea23b"
SRC_URI[sha256sum] = "3ab70c8dc4dfddae75923201f1e8614f3e2e28ffd2089d07867a7fbb2bb25b06"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.9.2-0"

inherit catkin
