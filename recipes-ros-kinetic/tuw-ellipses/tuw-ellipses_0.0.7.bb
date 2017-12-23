# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The tuw_ellipses package contains a computer vision library which is able to det"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native cmake-modules cv-bridge dynamic-reconfigure eigen image-geometry image-transport marker-msgs nodelet roscpp rospy tf"
SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/kinetic/tuw_ellipses/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e12a04c2838218c722d03434daefbc52"
SRC_URI[sha256sum] = "e7084fd0b85be3b40470e512d2f14e9db9ef1f75812361e1061dd4b691b10fdd"
S = "${WORKDIR}/tuw_marker_detection-release-release-kinetic-tuw_ellipses-0.0.7-0"

inherit catkin
