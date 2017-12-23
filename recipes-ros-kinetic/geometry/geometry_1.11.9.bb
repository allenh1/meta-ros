# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native eigen-conversions kdl-conversions tf tf-conversions"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6569078603fb8985bec59857d34d3cfe"
SRC_URI[sha256sum] = "65d56ee2cd5b9a614b33c97035e304671f910432a1c130be7cfb27911d4e5df5"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.11.9-0"

inherit catkin
