# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=32;endline=32;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "abb-driver abb-resources catkin-native joint-state-publisher robot-state-publisher roslaunch rviz"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_irb2400_support/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b103f9576efdd322711cea2acb7f6b7"
SRC_URI[sha256sum] = "d9fcb55fd424b1184ce172aa0e5fe08f5750a25af95f45a564a7306c11d657c7"
S = "${WORKDIR}/abb-release-release-kinetic-abb_irb2400_support-1.3.0-1"

inherit catkin
