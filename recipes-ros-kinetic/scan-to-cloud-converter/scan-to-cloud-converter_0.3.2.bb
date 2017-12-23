# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts LaserScan to PointCloud messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libpcl-all libpcl-all-dev pcl-conversions pcl-ros roscpp"
SRC_URI = "https://github.com/ros-gbp/scan_tools-release/archive/release/kinetic/scan_to_cloud_converter/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cdb55883cbc90b20e31ae43abe4dcd2a"
SRC_URI[sha256sum] = "bcfa4da677e54989fbe02414166c39ac0f26c6b364d1bd1c81725557c6afc7a5"
S = "${WORKDIR}/scan_tools-release-release-kinetic-scan_to_cloud_converter-0.3.2-0"

inherit catkin
