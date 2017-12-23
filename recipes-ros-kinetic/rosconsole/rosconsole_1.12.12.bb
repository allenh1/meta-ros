# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS console output library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "apr boost catkin-native cpp-common log4cxx rosbuild rostime rosunit"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "37aedce95d043bace4ecddbc31469ca8"
SRC_URI[sha256sum] = "bf62d1c8f883eb40abfceffeeeae75ac1be33df6500804a602e18b472928614a"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin
