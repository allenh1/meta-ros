# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf is a package that lets the user keep track of multiple coordinate frames over"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native catkin geometry-msgs graphviz message-filters message-generation message-runtime rosconsole roscpp rostime roswtf sensor-msgs std-msgs tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/${PN}/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "52e187cc658e11b8348277903f2a31d7"
SRC_URI[sha256sum] = "350e4ddfc5d16246e4d43d047a70495f1c7942ac64d7176c486cbf664712b716"
S = "${WORKDIR}/geometry-release-release-lunar-${PN}-1.11.9-0"

inherit catkin
