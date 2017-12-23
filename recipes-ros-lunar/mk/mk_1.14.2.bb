# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A collection of .mk include files for building ROS architectural elements.     M"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin rosbuild"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/${PN}/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "364aba8c141441963f9143dfbf6fd455"
SRC_URI[sha256sum] = "2870ba0fcfd29d2bbb752568bf47a33db69aa2f30c96841143899045d71dd359"
S = "${WORKDIR}/ros-release-release-lunar-${PN}-1.14.2-0"

inherit catkin
