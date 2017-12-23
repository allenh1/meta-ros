# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The laser_scan_splitter takes in a LaserScan message and splits it into a number"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/scan_tools-release/archive/release/kinetic/laser_scan_splitter/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff6c28ec56a9df253352d3273a5e72f7"
SRC_URI[sha256sum] = "1ca78fa9bf67097693b7a19019a02b96ad48d310cf5d39e9a5e07d21b9f639ad"
S = "${WORKDIR}/scan_tools-release-release-kinetic-laser_scan_splitter-0.3.2-0"

inherit catkin
