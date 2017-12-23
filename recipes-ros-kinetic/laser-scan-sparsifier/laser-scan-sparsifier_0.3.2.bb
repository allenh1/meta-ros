# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The laser_scan_sparsifier takes in a LaserScan message and sparsifies it."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/scan_tools-release/archive/release/kinetic/laser_scan_sparsifier/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0044a35c12e579994e16e0d64dcebc24"
SRC_URI[sha256sum] = "10a428f5d23faabb6d9d82e72f935e3e9f12da1332434ea34f229a469ae44d89"
S = "${WORKDIR}/scan_tools-release-release-kinetic-laser_scan_sparsifier-0.3.2-0"

inherit catkin
