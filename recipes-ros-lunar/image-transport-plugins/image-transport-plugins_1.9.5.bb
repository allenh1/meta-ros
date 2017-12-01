# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of plugins for publishing and subscribing to sensor_msgs/Image topics     "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native compressed-depth-image-transport compressed-image-transport theora-image-transport"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/lunar/image_transport_plugins/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0585af0d6a989f9d8b7337307ed61538"
SRC_URI[sha256sum] = "af224372ff5e069e03f1e960d544b2d5cd595eaf2c6f27cf4b86696088f4ee73"
S = "${WORKDIR}/image_transport_plugins-release-release-lunar-image_transport_plugins-1.9.5-0"

inherit catkin
