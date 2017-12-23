# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common messages for underwater robotics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime roscpp std-msgs visualization-msgs"
SRC_URI = "https://github.com/uji-ros-pkg/underwater_simulation-release/archive/release/kinetic/underwater_sensor_msgs/1.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "675eb98256388e1ee16c0d279aa2d573"
SRC_URI[sha256sum] = "09e79419faaff652910292b12a85e36b44065acd3d2d3148d39d7c2d4b29a16f"
S = "${WORKDIR}/underwater_simulation-release-release-kinetic-underwater_sensor_msgs-1.4.1-0"

inherit catkin
