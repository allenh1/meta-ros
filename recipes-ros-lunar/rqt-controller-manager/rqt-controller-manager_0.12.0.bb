# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rqt_controller_manager package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin controller-manager rqt-gui"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/rqt_controller_manager/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "20dffc76f939c6def3a5e22b311934ee"
SRC_URI[sha256sum] = "7ca8ad7e9ca5269e9e27e7773629e1f9f4c9ceaa61d116f0f7853f185e553680"
S = "${WORKDIR}/ros_control-release-release-lunar-rqt_controller_manager-0.12.0-0"

inherit catkin
