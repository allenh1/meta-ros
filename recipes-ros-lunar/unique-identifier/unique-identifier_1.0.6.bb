# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages and interfaces for universally unique identifiers.      Not needed "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native unique-id uuid-msgs"
SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/lunar/unique_identifier/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d1c5041119ac20a3d11b81c15505ede7"
SRC_URI[sha256sum] = "666bceb4c7e46d8f3c2dc2cf4f42769949659fb86d1c4dc5091a01efeeaafe23"
S = "${WORKDIR}/unique_identifier-release-release-lunar-unique_identifier-1.0.6-0"

inherit catkin
