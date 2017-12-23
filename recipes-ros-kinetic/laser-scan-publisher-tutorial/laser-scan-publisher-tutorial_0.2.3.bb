# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The laser_scan_publisher_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/kinetic/laser_scan_publisher_tutorial/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b24ffbdfdde5cae0da72aba94589c39a"
SRC_URI[sha256sum] = "240f40c3a13ec6e9b0947b95666f2764eab2fb735ac4bb70a19a2f90dea1e768"
S = "${WORKDIR}/navigation_tutorials-release-release-kinetic-laser_scan_publisher_tutorial-0.2.3-0"

inherit catkin
