# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The odometry_publisher_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nav-msgs roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/kinetic/odometry_publisher_tutorial/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "355a5f83387e09d6f4efe60297c6910d"
SRC_URI[sha256sum] = "70cea6a4d984eee00bbf0c0b2099a0f7634596d9b414ab2c9c2a2046c3a97028"
S = "${WORKDIR}/navigation_tutorials-release-release-kinetic-odometry_publisher_tutorial-0.2.3-0"

inherit catkin
