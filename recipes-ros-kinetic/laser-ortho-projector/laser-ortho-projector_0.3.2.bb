# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The laser_ortho_projector package calculates orthogonal projections of LaserScan"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs libpcl-all libpcl-all-dev message-filters nodelet pcl-conversions pcl-ros roscpp sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/scan_tools-release/archive/release/kinetic/laser_ortho_projector/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ad33006821f98bd57f76370fa83f59a2"
SRC_URI[sha256sum] = "8c946a9d9355a0669979fe7a960d820d3bc68b10b2fae22bc5795bbd25bbba6f"
S = "${WORKDIR}/scan_tools-release-release-kinetic-laser_ortho_projector-0.3.2-0"

inherit catkin
