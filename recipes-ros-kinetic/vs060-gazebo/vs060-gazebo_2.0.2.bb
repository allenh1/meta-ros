# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Gazebo simulation package for Denso vs060 arm."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager gazebo-ros vs060"
SRC_URI = "https://github.com/start-jsk/denso-release/archive/release/kinetic/vs060_gazebo/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5eded0da42c35f8ae60bd4992cd87000"
SRC_URI[sha256sum] = "1ebc1e232a2d4642e17aa63fb88f1a693e02248c44a5130969972d7bfdd12ad9"
S = "${WORKDIR}/denso-release-release-kinetic-vs060_gazebo-2.0.2-0"

inherit catkin
