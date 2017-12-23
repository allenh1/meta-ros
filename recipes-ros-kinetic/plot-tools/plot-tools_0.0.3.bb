# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "plot_tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy"
SRC_URI = "https://github.com/srv/srv_tools-release/archive/release/kinetic/plot_tools/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fd7ece74e8888643207e8e2798539cfb"
SRC_URI[sha256sum] = "749c5e70c3d85169a8dcb63ee406b9727028609a11ce7ab1d4a7679ee0c7ac35"
S = "${WORKDIR}/srv_tools-release-release-kinetic-plot_tools-0.0.3-0"

inherit catkin
