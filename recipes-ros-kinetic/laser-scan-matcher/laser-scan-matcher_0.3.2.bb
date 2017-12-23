# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=8f4a6eccc9c6aaf3f4a8a4bd8353c9b8"

DEPENDS = "catkin-native csm geometry-msgs libpcl-all libpcl-all-dev nav-msgs nodelet pcl-conversions pcl-ros roscpp sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/scan_tools-release/archive/release/kinetic/laser_scan_matcher/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2fcc795e05670c8c7c06eb8450375435"
SRC_URI[sha256sum] = "cbeb10975db44f053f24aad7539ee0fe890f00f50602fd9f659c27cdaf246a48"
S = "${WORKDIR}/scan_tools-release-release-kinetic-laser_scan_matcher-0.3.2-0"

inherit catkin
