# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage which extends ros_core and includes other basic non-robot tools li"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib bond-core catkin-native class-loader dynamic-reconfigure nodelet-core pluginlib ros-core"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/kinetic/ros_base/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8177b43ff9e026bfff734bbc51d234e"
SRC_URI[sha256sum] = "c7f99f3f996a81b23846386c82be11ccf86ca71d650bf5ed8c0b9f1f17ee5052"
S = "${WORKDIR}/metapackages-release-release-kinetic-ros_base-1.3.1-0"

inherit catkin
