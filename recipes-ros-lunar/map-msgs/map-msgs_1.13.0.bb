# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages commonly used in mapping packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "catkin-native message-generation message-runtime nav-msgs sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation_msgs-release/archive/release/lunar/map_msgs/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "692c3aba98eb863604129009b4a2c7e9"
SRC_URI[sha256sum] = "86c5ca9ad9fdf0f6f06f89ba0a5a75c3621edb31cace52ce77570910a4978a44"
S = "${WORKDIR}/navigation_msgs-release-release-lunar-map_msgs-1.13.0-0"

inherit catkin
