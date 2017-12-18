# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of how to use the xpp framework."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin rosbag roscpp xpp-hyq xpp-quadrotor xpp-vis"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/lunar/xpp_examples/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9116453df8fa21133867934d53ab7a36"
SRC_URI[sha256sum] = "7b4dadb5ca03ed971e67e399cebf7a3323370118ea8ac68188cdf7a543226857"
S = "${WORKDIR}/xpp-release-release-lunar-xpp_examples-1.0.3-0"

inherit catkin
