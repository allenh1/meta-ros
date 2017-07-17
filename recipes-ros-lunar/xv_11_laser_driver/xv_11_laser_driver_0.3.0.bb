# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Neato XV-11 Laser Driver. This driver works with the laser when it is removed fr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=a367cd94a830bcaf4974fb7e20728b04"

DEPENDS = "boost catkin roscpp sensor_msgs"
SRC_URI = "https://github.com/rohbotics/xv_11_laser_driver-release/archive/release/lunar/xv_11_laser_driver/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "185c2f2eca2e9f1fd3c70edac1efcdc6"
SRC_URI[sha256sum] = "1173b4ec9cb72d0c5ff49e7cac788766535969be82de33997badd2f9e04481b7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
