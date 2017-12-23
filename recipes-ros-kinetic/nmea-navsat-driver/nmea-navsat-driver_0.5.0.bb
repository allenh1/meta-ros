# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package to parse NMEA strings and publish a very simple GPS message. Does not re"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native geometry-msgs nmea-msgs python-serial roslint rospy sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/nmea_navsat_driver-release/archive/release/kinetic/nmea_navsat_driver/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ef04dfac2f24c91ce833200d2d4206e"
SRC_URI[sha256sum] = "1b9c9f49780db7ef568330548c4a718bd65e20dc016c967d7bf075ed777e006a"
S = "${WORKDIR}/nmea_navsat_driver-release-release-kinetic-nmea_navsat_driver-0.5.0-0"

inherit catkin
