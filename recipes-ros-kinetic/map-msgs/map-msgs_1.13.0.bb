# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages commonly used in mapping packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "catkin-native message-generation message-runtime nav-msgs sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation_msgs-release/archive/release/kinetic/map_msgs/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d8bd6007da38352118d253fa20cb2fa"
SRC_URI[sha256sum] = "d64d8011c9286a5ca31e055bbf201d5fee118e79851feade72e3b6c2faa1b20a"
S = "${WORKDIR}/navigation_msgs-release-release-kinetic-map_msgs-1.13.0-0"

inherit catkin
