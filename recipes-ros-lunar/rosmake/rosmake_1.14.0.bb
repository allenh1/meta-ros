# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosmake is a ros dependency aware build tool which can be used to      build all"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/rosmake/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ddee55b55cf0fa839b0969c74842f8f6"
SRC_URI[sha256sum] = "1655a592fd908559314429750009f458ac81fac1e0c443d83baf7a99ecb8e374"
S = "${WORKDIR}/ros-release-release-lunar-rosmake-1.14.0-0"

inherit catkin
