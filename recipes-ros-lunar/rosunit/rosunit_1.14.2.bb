# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Unit-testing package for ROS. This is a lower-level library for rostest and hand"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-rospkg roslib"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/${PN}/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "790c916375809127d9c478fd2f4bd987"
SRC_URI[sha256sum] = "228e24e1740b77d4f1b8f3cdd425a1e18b5c499d8d279d684a7768ec9cdd1933"
S = "${WORKDIR}/ros-release-release-lunar-${PN}-1.14.2-0"

inherit catkin
