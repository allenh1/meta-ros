# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The jsk_calibration package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pr2-msgs roseus"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/jsk_calibration/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b70b6e3a39e2d4c396cdea36d852231a"
SRC_URI[sha256sum] = "7e662c8e88a4355d74d9d0d674bed0c3bfd8d760d9babefc15da08167a040ad2"
S = "${WORKDIR}/jsk_control-release-release-kinetic-jsk_calibration-0.1.13-0"

inherit catkin
