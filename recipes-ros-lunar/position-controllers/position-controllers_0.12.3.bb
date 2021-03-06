# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "position_controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface forward-command-controller"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/position_controllers/0.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "97ab74d88f39b7cb4a6826be945230ae"
SRC_URI[sha256sum] = "401fb1d1ec430c06d8ea0af795622d62972cb329577e30f187064003b46da35c"
S = "${WORKDIR}/ros_controllers-release-release-lunar-position_controllers-0.12.3-0"

inherit catkin
