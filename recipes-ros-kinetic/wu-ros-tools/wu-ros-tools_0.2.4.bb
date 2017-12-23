# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A collection of tools for making a variety of generic ROS-related tasks easier."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native easy-markers joy-listener kalman-filter rosbaglive"
SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/kinetic/wu_ros_tools/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "913588bc7d10124ada6c98c748cbd366"
SRC_URI[sha256sum] = "1af04eed17642d9b3b65758a7693fc3d8df725cc1fa62ee5f04d83040fde532d"
S = "${WORKDIR}/wu_ros_tools-release-kinetic-wu_ros_tools-0.2.4-0"

inherit catkin
