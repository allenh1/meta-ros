# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of packages that include controller interfaces, controller managers, trans"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin combined-robot-hw combined-robot-hw-tests controller-interface controller-manager controller-manager-msgs controller-manager-tests hardware-interface joint-limits-interface realtime-tools transmission-interface"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/ros_control/0.11.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ebaff008d55e6cac0424a956f91ca21"
SRC_URI[sha256sum] = "b8481d4b8012be6b0d1c46e144d8d0d548c61d3983d00cbd498e1bf8dabbfd90"
S = "${WORKDIR}/ros_control-release-release-lunar-ros_control-0.11.5-0"

inherit catkin
