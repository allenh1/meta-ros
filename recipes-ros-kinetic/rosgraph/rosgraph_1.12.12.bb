# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosgraph contains the rosgraph command-line tool, which prints     information a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-netifaces python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bd7050d68c6d767c5d03fcfb20d3f059"
SRC_URI[sha256sum] = "b1d51a3dedd4c6793f8e7d58ae12256727d37efff946cb6a1e8c2f190d34dcba"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin
