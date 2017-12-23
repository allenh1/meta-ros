# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages and interfaces for universally unique identifiers.      Not needed "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native unique-id uuid-msgs"
SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/kinetic/unique_identifier/1.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "35836e6c44675df1b17ab3fe022ec22d"
SRC_URI[sha256sum] = "96ac4f491b59d0d3dc724d4707a04b3c6a91358f416476e616090954734bfd51"
S = "${WORKDIR}/unique_identifier-release-release-kinetic-unique_identifier-1.0.5-0"

inherit catkin
