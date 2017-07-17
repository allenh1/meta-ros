# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "polled_camera contains a service and C++ helper classes for implementing a polle"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=db328af5d0df1c99330c1a3fc97269ae"

DEPENDS = "catkin image_transport message_generation message_runtime roscpp sensor_msgs std_msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/polled_camera/1.11.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b0ac1d27c88a7c2aac46872264686075"
SRC_URI[sha256sum] = "4ed667862ddf0cb96a887fa84d1bd33b9d71ae581f31a4f75417a35127e5274d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
