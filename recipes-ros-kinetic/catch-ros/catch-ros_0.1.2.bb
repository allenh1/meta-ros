# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS integration for the Catch unit test framework"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/AIS-Bonn/catch_ros-release/archive/release/kinetic/catch_ros/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "40d20f15f77516e5e781a05ff216ce58"
SRC_URI[sha256sum] = "48022b7074b57b48d391b47096f5f3c675c8d9061f03eef7ace71e88d53d96e0"
S = "${WORKDIR}/catch_ros-release-release-kinetic-catch_ros-0.1.2-0"

inherit catkin
