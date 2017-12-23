# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_gazebo_plugins provides gazebo plugins from Team Hector.      Currently i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure gazebo gazebo-ros geometry-msgs libgazebo7-dev message-generation message-runtime nav-msgs roscpp std-msgs std-srvs tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/kinetic/hector_gazebo_plugins/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "928fa8c1d86db20995fdc214252b7a87"
SRC_URI[sha256sum] = "a55813892b189be9f5b0adf06d1e981fe8aca34e67c2abd58d92f8d278c1f153"
S = "${WORKDIR}/hector_gazebo-release-release-kinetic-hector_gazebo_plugins-0.5.0-0"

inherit catkin
